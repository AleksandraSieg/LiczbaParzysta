package pl.madison.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.madison.domain.Liczby;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {
    private List<Integer> listaLiczb = new ArrayList<Integer>();
    private List<Integer> nowaListaLiczb = new ArrayList<Integer>();

    @RequestMapping(value = "/uzupelnij")
    public String uzupelnij(Map<String, Object> model){
        model.put("uzup", new Liczby());
        return "uzupelnijL";
    }

    @RequestMapping(value="/parzyste", method = RequestMethod.POST)
    public String parzyste(Liczby liczby, Map<String, Object> model){
        listaLiczb.add(liczby.getLiczba1());
        listaLiczb.add(liczby.getLiczba2());
        listaLiczb.add(liczby.getLiczba3());
        listaLiczb.add(liczby.getLiczba4());

        for(Integer i : listaLiczb){
            if(i%2==0){
                nowaListaLiczb.add(i);
            }
        }
        model.put("znajdz", nowaListaLiczb);
        return "parzyste";
    }
}
