public class Playlist implements IComponent {

	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

  // Your code goes here!
	public void Play() {
		for (IComponent component : playlist) {
			component.Play();
		}
	}
	public void setPlayBackSpeed(float speed) {

	}
	public String getName() {
			return playlistName;
	}

	public void add(IComponent component) {

	}

	public void remove(IComponent )

}