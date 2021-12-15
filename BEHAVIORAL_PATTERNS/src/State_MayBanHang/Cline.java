package State_MayBanHang;

public class Cline {
	State state;
	public void getState(State _state) {
		this.state = _state;
	}
	public String applyState() {
		return this.state.getHandlerRequest();
					
	}
}
