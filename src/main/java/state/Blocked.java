package state;

public class Blocked implements MissionState {
    @Override
    public void next(Mission mission) {
        mission.setMissionState(new Unblocked());
    }

    @Override
    public String print() {
        return "is blocked";
    }
}
