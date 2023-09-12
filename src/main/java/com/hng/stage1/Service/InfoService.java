package com.hng.stage1.Service;

import com.hng.stage1.Domain.Constants;
import com.hng.stage1.Domain.Response;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;

@Service
public class InfoService {
    public Response getInfo(String track,String slackName){
        try{
            return new Response(
                    slackName,
                    String.valueOf(LocalDate.now().getDayOfWeek()),
                    String.valueOf(LocalDateTime.now(ZoneOffset.UTC)),
                    track,
                    Constants.GITHUB_FILE_URL,
                    Constants.GITHUB_REPO_URL,
                    200

            );
        }catch(Exception e){
            throw new IllegalStateException("Could not get Info");
        }
    }

}
