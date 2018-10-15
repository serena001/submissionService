package submission.domain.consumerForm;

public class Incident {
	String numberAffectedPersons;
	String incidentDescription;
	AffectedPersons affectedPersons;
	public String getNumberAffectedPersons() {
		return numberAffectedPersons;
	}
	public void setNumberAffectedPersons(String numberAffectedPersons) {
		this.numberAffectedPersons = numberAffectedPersons;
	}
	public String getIncidentDescription() {
		return incidentDescription;
	}
	public void setIncidentDescription(String incidentDescription) {
		this.incidentDescription = incidentDescription;
	}
	public AffectedPersons getAffectedPersons() {
		return affectedPersons;
	}
	public void setAffectedPersons(AffectedPersons affectedPersons) {
		this.affectedPersons = affectedPersons;
	}
}
