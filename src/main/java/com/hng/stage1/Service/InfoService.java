package com.hng.stage1.Service;

import com.hng.stage1.Domain.Constants;
import com.hng.stage1.Domain.Response;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

@Service
public class InfoService {

    public Response getInfo(String track,String slackName){
        try{
            DayOfWeek currentDay = DayOfWeek.of(LocalDateTime.now(ZoneOffset.UTC).get(ChronoField.DAY_OF_WEEK));
            String currentDayTitleCase = currentDay.getDisplayName(TextStyle.FULL, Locale.US);

            LocalDateTime utcNow = LocalDateTime.now(ZoneOffset.UTC);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
            String currentUtcTimeFormatted = utcNow.format(formatter);
            return new Response(
                    slackName,
                    currentDayTitleCase,
                    currentUtcTimeFormatted,
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
