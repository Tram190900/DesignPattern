package State_Document;

public class Document {
	State state;
	public void getSate(State _state) {
		this.state = _state;
	}
	public String ApplyState() {
		return state.HandlerRequest();
	}
}
