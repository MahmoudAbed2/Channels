package com.abed23.channels.service;

import com.abed23.channels.model.entity.Channels;
import com.abed23.channels.repository.ChannelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChannelsService {
    @Autowired
    private ChannelsRepository channelsRepository;
    public Channels getUser( Integer id){
        Optional<Channels>channels=this.channelsRepository.findById(id);
        return channels.orElse(null);
    }
    public Channels save(Channels channels){
       return this.channelsRepository.save(channels);
    }

    public void  delete (Integer id){
        this.channelsRepository.deleteById(id);
    }

    public List<Channels> getAll() {
        return this.channelsRepository.findAll();
    }
}