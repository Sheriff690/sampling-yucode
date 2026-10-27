package com.yukon.whoweare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.yukon.whoweare.service.TeamService;
import com.yukon.whoweare.service.HistoryService;

@Controller
public class HomeController {
    private final TeamService teamService;
    private final HistoryService historyService;

    public HomeController(TeamService teamService, HistoryService historyService) {
        this.teamService = teamService;
        this.historyService = historyService;
    }

    @GetMapping({"/", "/home"})
    public String home() {
        return "home";
    }

    @GetMapping("/team")
    public String team(Model model) {
        model.addAttribute("members", teamService.getAllMembers());
        return "team";
    }

    @GetMapping("/history")
    public String history(Model model) {
        model.addAttribute("milestones", historyService.getAllMilestones());
        return "history";
    }

    @GetMapping("/values")
    public String values() {
        return "values";
    }
}
