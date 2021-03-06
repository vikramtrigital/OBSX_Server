package org.mifosplatform.crm.clientprospect.data;

public class ProspectPlanCodeData {

	private Long id;
	private String planDescription;

	public ProspectPlanCodeData() {
	}

	public ProspectPlanCodeData(final Long id, final String planDescription) {
		this.id = id;
		this.planDescription = planDescription;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlanDescription() {
		return planDescription;
	}

	public void setPlanDescription(String planDescription) {
		this.planDescription = planDescription;
	}
}
