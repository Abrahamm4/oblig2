package com.example.oblig2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BillettController {

    public final List<Billett> billettRegister = new ArrayList<>();

    @PostMapping("/kjopBillett")
    public void kjopBillett(Billett billett){
        billettRegister.add(billett);
    }

    @GetMapping("/hentAlleBilletter")
    public List<Billett> hentAlleBilletter(){
        return billettRegister;
    }

    @GetMapping("/slettAlleBilletter")
    public void slettAlleBilletter(){
        billettRegister.clear();
    }
}
