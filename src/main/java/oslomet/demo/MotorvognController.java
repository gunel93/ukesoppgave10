package oslomet.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MotorvognController {

    @Autowired
    private MotorvognRepository rep;

    @GetMapping("/hentBiler")
    public List<Bil> hentBiler()
    {
        return rep.hentAlleBiler();
    }

    @PostMapping("/lagre")
    public void lagreKunde(Motorvogn bil)
    {
       rep.lagreMotorvogn(bil);
    }

    @GetMapping("/hentAlle")
    public List<Motorvogn> hentAlle()
    {
        return rep.hentAlleMotorvogner();
    }

    @GetMapping("/slettAlle")
    public void slettAlle(){

        rep.slettAlleMotorvogner();
    }

    @GetMapping("/slettEnMotorvogn")
    public void slettEnMotorvogn(String personnr){
        rep.slettEnMotorvogn(personnr);

    }
}

