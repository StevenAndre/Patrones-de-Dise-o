package state;

public class Progress implements MissionState{
    @Override
    public void next(Mission mission) {
        if (Math.random()<0.5)
            mission.setMissionState(new Failed());
        else
            mission.setMissionState(new Completed());
    }

    @Override
    public String print() {
        return " is in progress";
    }
}
