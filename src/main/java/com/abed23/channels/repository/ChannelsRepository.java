package com.abed23.channels.repository;

import com.abed23.channels.model.entity.Channels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelsRepository extends JpaRepository<Channels, Integer> {
}