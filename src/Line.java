public class Line {
	private double angle;

	public Line(){
		this.setAngle(0);
	}
	/**
	 * @return the angle
	 */
	public double getAngle() {
		return angle;
	}
	/**
	 * @param angle the angle to set
	 */
	public void setAngle(double angle) {
		this.angle = angle;
	}
	public void increaseAngle(){
		angle++;
		if(angle>=360){
			setAngle(0);
		}
	}
	public void decreaseAngle(){
		angle--;
		if(angle<=0){
			setAngle(360);
		}
	}
}