package br.edu.iftm.tspi.crud.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.iftm.tspi.crud.dto.CrudDTO;

@Controller
public class CrudResource {

    private List<CrudDTO> dados = new ArrayList<>();

    @PostMapping("crudPost")
    public String doPost(CrudDTO dto, Model model) {
        dados.add(dto);
        return doGet(model);
    }

    @RequestMapping("crudGet")
    public String doGet(Model model) {
        model.addAttribute("dados", dados);
        return "lista";

    }

}
