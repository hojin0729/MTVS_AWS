package aws.demoelasticbeantalk.menu.controller;

import aws.demoelasticbeantalk.menu.dto.MenuDto;
import aws.demoelasticbeantalk.menu.service.MenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class MenuController {
    private final MenuService menuService;

    @GetMapping("/list")
    public List<MenuDto> getAllMenus() {
        List<MenuDto> list = menuService.getAllMenus();
        log.info("[menuController] : getAllMenus {}", list);
        return list;
    }

    @GetMapping("/check")
    public String checkVersion() {
        return "😍version 1.0.0😍";
    }
}