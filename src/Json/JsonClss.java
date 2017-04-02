package Json;


public class JsonClss {
	
	private String id;
	private String name;
	private String url;
	private String season;
	private String number;
	private String runtime;
	private String summary;
	
	public JsonClss(String id, String name, String url, String season,String number,String runtime,String summary) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
		this.season = season;
		this.number = number;
//		this.runtime = runtime;
//		this.summary = summary;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getSeason() {
		return season;
	}
	
	public void setSeason(String season) {
		this.season = season;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}

	public String getRunime() {
		return runtime;
	}
	
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	public String getSummary() {
		return summary;
	}
	
	public void setSummary(String summary) {
		this.summary = summary;
	}
	@Override
	public String toString() {
		return "JsonClss [id=" + id + ", name=" + name
				+ ", URL=" + url + ", Season=" + season + ", Number="
				+ number + ", Runtime="
						+ runtime+", Summary=" +summary+"]";
	}
}