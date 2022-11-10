package kopo.poly.controller;

import kopo.poly.dto.FoodDTO;
import kopo.poly.service.IFoodService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RequestMapping(value="/food")
@Controller
public class FoodController {

    @Resource(name = "FoodService")
    private IFoodService foodService;

    @RequestMapping(value="toDayFood")
    public String collectFood(ModelMap model) throws Exception {

        log.info(getClass().getName() + ".toDayFood start");

        List<FoodDTO> rList = foodService.toDayFood();

        model.addAttribute("rList", rList);

        log.info(this.getClass().getName() + ".toDayFood End!");

        return "/food/todayFood";
    }
}
