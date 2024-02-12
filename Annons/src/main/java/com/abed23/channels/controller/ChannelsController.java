package com.abed23.channels.controller;

import com.abed23.channels.model.entity.Channels;
import com.abed23.channels.service.ChannelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/channels")
public class ChannelsController {
@Autowired
    private ChannelsService channelsService;

    @GetMapping("/get-channel")
    public Channels getUser(@RequestParam Integer id ){
        return channelsService.getUser(id);
    }

    @PostMapping ("/save-channel")
    public Channels save(@RequestBody Channels channels ){
        return channelsService.save(channels);
    }
    @GetMapping  ("/delete-channel")
    public void delete(@RequestParam Integer id   ){
        channelsService.delete(id);
    }

    @GetMapping  ("/get-all")
    public List<Channels> getAll(){
      return this.channelsService.getAll();
    }

    @PostMapping ("/update-channel")
    public Channels update(@RequestBody Channels channels ){
        return channelsService.save(channels);
    }

    
}
