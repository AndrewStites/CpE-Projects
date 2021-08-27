public class car {
    private int mLane;
    private float mSpeed;
    private float mZPos;
    private int spriteIndex;

    public int getLane()
    {
        return this.mLane;
    }

    public void setLane(int laneToSet)
    {
        this.mLane = laneToSet;
    }

    public float getSpeed()
    {
        return this.mSpeed;
    }

    public void setSpeed(float speedToSet)
    {
        this.mSpeed = speedToSet;
    }

    public float getZPos()
    {
        return this.mZPos;
    }

    public void setZPos(float zToSet)
    {
        this.mZPos = zToSet;
    }

    public int getSpriteIndex()
    {
        return this.spriteIndex;
    }

    public void setSpriteIndex(int newIndex)
    {
        this.spriteIndex = newIndex;
    }

    public car(int laneToSet, float speedToSet, float zToSet, int newIndex)
    {
        this.mLane = laneToSet;
        this.mSpeed = speedToSet;
        this.mZPos = zToSet;
        this.spriteIndex = newIndex;
    }

}
