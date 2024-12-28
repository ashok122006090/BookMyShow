package com.example.bmsbookticket.controllers;

import com.example.bmsbookticket.dtos.CreateShowRequestDTO;
import com.example.bmsbookticket.dtos.CreateShowResponseDTO;
import com.example.bmsbookticket.dtos.ResponseStatus;
import com.example.bmsbookticket.exceptions.FeatureNotSupportedByScreen;
import com.example.bmsbookticket.exceptions.InvalidDateException;
import com.example.bmsbookticket.exceptions.MovieNotFoundException;
import com.example.bmsbookticket.exceptions.ScreenNotFoundException;
import com.example.bmsbookticket.exceptions.UnAuthorizedAccessException;
import com.example.bmsbookticket.exceptions.UserNotFoundException;
import com.example.bmsbookticket.models.Show;
import com.example.bmsbookticket.services.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController {
    private ShowService showService;
    ShowController(ShowService showService){
        this.showService = showService;
    }
    public CreateShowResponseDTO createShow(CreateShowRequestDTO requestDTO) {
        CreateShowResponseDTO responseDTO = new CreateShowResponseDTO();
        try{
            Show createdShow = showService.createShow(
                    requestDTO.getUserId(),
                    requestDTO.getMovieId(),
                    requestDTO.getScreenId(),
                    requestDTO.getStartTime(),
                    requestDTO.getEndTime(),
                    requestDTO.getPricingConfig(),
                    requestDTO.getFeatures()
            );
            responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
            responseDTO.setShow(createdShow);
        }
        catch (MovieNotFoundException | ScreenNotFoundException | FeatureNotSupportedByScreen | InvalidDateException | UserNotFoundException | UnAuthorizedAccessException ex){
            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDTO;
    }
}
