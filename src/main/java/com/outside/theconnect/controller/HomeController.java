package com.outside.theconnect.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class HomeController {

    @GetMapping
    public String index() {
        return "homePage";
    }


    @GetMapping("/chat")
    public String getChat() {
        return "chats";
    }
    @GetMapping("/event")
    public String getEven(){
        return "event";
    }
    @GetMapping("/friends")
    public String getFriends(){
        return "friends";
    }
    @GetMapping("/gallery")
    public String getGallery(){
        return "gallery";
    }
    @GetMapping("/group-feed")
    public String getGroupFeed(){
        return "group-feed";
    }
    @GetMapping("groups")
    public String getGroups(){
        return "groups";
    }
    @GetMapping("/marketPlace")
    public String getMarketPlace(){
        return "marketplace";
    }
    @GetMapping("singleVideo")
    public String getSingleVid(){
        return "single-video";
    }
    @GetMapping("/timeline")
    public String getTimeLine(){
        return "timeline";
    }
    @GetMapping("/videos")
    public String getVideos(){
        return "videos";
    }


}
