package com.abed23.channels.controller;

import com.abed23.channels.model.entity.Channels;
import com.abed23.channels.service.ChannelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/channels")
public class ChannelsController {

    @Autowired
    private ChannelsService channelsService;



    //http://localhost:8080/channels/1
    @GetMapping("/{id}")
    public ResponseEntity<Channels> getChannel(@PathVariable Integer id) {
        Channels channel = channelsService.getChannel(id);
        return ResponseEntity.ok(channel);
    }
    //http://localhost:8080/channels
    @PostMapping
    public ResponseEntity<Channels> saveChannel(@RequestBody Channels channels) {
        Channels savedChannel = channelsService.saveChannel(channels);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedChannel);
    }
   //http://localhost:8080/channels/3
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChannel(@PathVariable Integer id) {
        channelsService.deleteChannel(id);
        return ResponseEntity.noContent().build();
    }

    //http://localhost:8080/channels
    @GetMapping
    public ResponseEntity<List<Channels>> getAllChannels() {
        List<Channels> channels = channelsService.getAllChannels();
        return ResponseEntity.ok(channels);
    }
//http://localhost:8080/channels/1
    @PutMapping("/{id}")
    public ResponseEntity<Channels> updateChannel(@PathVariable Integer id, @RequestBody Channels channels) {
        Channels updatedChannel = channelsService.updateChannel(id, channels);
        return ResponseEntity.ok(updatedChannel);
    }
}
