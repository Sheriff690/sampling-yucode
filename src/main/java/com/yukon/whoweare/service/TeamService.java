package com.yukon.whoweare.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.yukon.whoweare.model.TeamMember;

@Service
public class TeamService {
    public List<TeamMember> getAllMembers() {
        return List.of(
            new TeamMember("Alice Smith", "CEO", "/images/alice.jpg", "Leading Yukon with vision."),
            new TeamMember("Bob Johnson", "CTO", "/images/bob.jpg", "Architecting scalable solutions.")
        );
    }
}
