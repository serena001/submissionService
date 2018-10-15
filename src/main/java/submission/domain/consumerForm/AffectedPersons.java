package submission.domain.consumerForm;

import java.util.ArrayList;
import java.util.List;

public class AffectedPersons {
	List<AffectedPerson> affectedPersons=new ArrayList<AffectedPerson>();

	public List<AffectedPerson> getAffectedPersons() {
		return affectedPersons;
	}

	public void setAffectedPersons(AffectedPerson affectedPersons) {
		this.affectedPersons.add(affectedPersons);
	}

}
