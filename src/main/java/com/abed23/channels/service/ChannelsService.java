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

    public Channels getChannel(Integer id) {
        Optional<Channels> channelOptional = channelsRepository.findById(id);
        return channelOptional.orElse(null);
    }

    public Channels saveChannel(Channels channels) {
        return channelsRepository.save(channels);
    }

    public void deleteChannel(Integer id) {
        channelsRepository.deleteById(id);
    }

    public List<Channels> getAllChannels() {
        return channelsRepository.findAll();
    }

    public Channels updateChannel(Integer id, Channels updatedChannel) {
        Optional<Channels> channelOptional = channelsRepository.findById(id);
        if (channelOptional.isPresent()) {
            Channels existingChannel = channelOptional.get();
            existingChannel.setName(updatedChannel.getName());
            return channelsRepository.save(existingChannel);
        } else {
            return null;
        }
    }
}
