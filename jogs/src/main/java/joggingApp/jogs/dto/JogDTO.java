package joggingApp.jogs.dto;

import javax.persistence.Column;
import java.util.Objects;

public class JogDTO {
	private Long id;

	private String jogger_name;

	private Long distance;

	private Long time;

	private String date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJogger_name() {
		return jogger_name;
	}

	public void setJogger_name(String jogger_name) {
		this.jogger_name = jogger_name;
	}

	public Long getDistance() {
		return distance;
	}

	public void setDistance(Long distance) {
		this.distance = distance;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JogDTO jogDTO = (JogDTO) o;
		return Objects.equals(id, jogDTO.id) && Objects.equals(jogger_name, jogDTO.jogger_name) && Objects.equals(distance, jogDTO.distance) && Objects.equals(time, jogDTO.time) && Objects.equals(date, jogDTO.date);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, jogger_name, distance, time, date);
	}

}
