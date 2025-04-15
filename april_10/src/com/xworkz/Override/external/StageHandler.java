package com.xworkz.Override.external;

import com.xworkz.Override.internal.ConcertStage;
import com.xworkz.Override.internal.Stage;

public class StageHandler {
    public StageHandler() {
        System.out.println("No argument constructor in StageHandler");
    }

    public void handleStage(Stage stage) {
        if (stage != null) {
            stage.setupStage();
            stage.showPerformance();
            if (stage instanceof ConcertStage) {
                ConcertStage concert = (ConcertStage) stage;
                concert.arrangeSeating();
            } else {
                System.out.println("This is a general stage");
            }
        } else {
            System.out.println("Stage is null");
        }
    }
}
