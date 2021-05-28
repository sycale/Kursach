package joggingApp.jogs.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="jogs")
public class JogEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "jogger_name", nullable = false)
	private String jogger_name;

	@Column(name = "distance", nullable = false)
	private Long distance;

	@Column(name="time", nullable = false)
	private Long time;

	@Column(name="date", nullable = false)
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JogEntity jogEntity = (JogEntity) o;
		return Objects.equals(id, jogEntity.id) && Objects.equals(jogger_name, jogEntity.jogger_name) && Objects.equals(distance, jogEntity.distance) && Objects.equals(date, jogEntity.date) && Objects.equals(time, jogEntity.time);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, jogger_name, distance, date, time);
	}
}
