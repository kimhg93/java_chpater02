package chpater02;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String Artist;
	private String composer;
	
	private int year;
	private int track;
	
	public Song() {
	}
	public Song(String title, String artist) {
		//this.title = title;
		//this.artist = artist;
		
		this(title, null, artist, null, 0, 0); // some code 들도 같이 사용 가능 > 로직을 한번에 수정 가능
	}	
	public Song(String title, String album, String artist, String composer, int year, int track) {
		this.title = title;
		this.album = album;
		this.artist = artist;
		this.composer = composer;
		this.year = year;
		this.track = track;
		
		// some code 1
		// some code 2
		// some code 3
	}	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public void show() {
		System.out.println(
				artist+" "+
				title+" ("+
				album + ", "+
				year+", "+
				track+"번 track, "+
				composer+" 작곡)");
		
	}
}
