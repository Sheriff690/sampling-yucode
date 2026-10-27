package com.yukon.whoweare.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.yukon.whoweare.model.Milestone;

@Service
public class HistoryService {
    public List<Milestone> getAllMilestones() {
        return List.of(
            new Milestone(2010, "Founded Yukon in a garage."),
            new Milestone(2012, "Released first product: Yukon Analytics."),
            new Milestone(2015, "Expanded to 3 countries.")
        );
    }
}
