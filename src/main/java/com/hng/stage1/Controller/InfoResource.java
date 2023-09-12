package com.hng.stage1.Controller;

import com.hng.stage1.Domain.Response;
import com.hng.stage1.Service.InfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class InfoResource {
    private final InfoService infoService;

    public InfoResource(InfoService infoService) {
        this.infoService = infoService;
    }

    @GetMapping
    public ResponseEntity<?> getTrackInformation(@RequestParam("track") String track,
                                                 @RequestParam("slack_name") String slack_name){
        try{
            Response response=infoService.getInfo(track,slack_name);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("Could not get information",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
