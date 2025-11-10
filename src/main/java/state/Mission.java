package state;

public class Mission {

    private String name;
    private MissionState missionState;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MissionState getMissionState() {
        return missionState;
    }

    public void setMissionState(MissionState missionState) {
        this.missionState = missionState;
    }

    public Mission(String name) {
        this.name = name;
        this.missionState=new Blocked();
    }


    public void next(){
        missionState.next(this);
    }

    @Override
    public String toString() {
        return "Mission{" +
                "name='" + name + '\'' +
                ", missionState=" + missionState.print() +
                '}';
    }
}
