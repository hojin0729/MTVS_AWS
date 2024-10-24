package aws.demoelasticbeantalk.menu.service;

import aws.demoelasticbeantalk.menu.dto.MenuDto;
import aws.demoelasticbeantalk.menu.entity.Menu;
import aws.demoelasticbeantalk.menu.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class MenuService {

    private final MenuRepository menuRepository;

    public List<MenuDto> getAllMenus() {
        List<Menu> menus = menuRepository.findAll();
        List<MenuDto> menuDtos = menus.stream().map(MenuDto::new).toList();
        return menuDtos;
    }
}
