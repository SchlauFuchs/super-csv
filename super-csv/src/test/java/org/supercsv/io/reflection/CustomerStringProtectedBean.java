/*
 * Copyright 2007 Kasper B. Graversen
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.supercsv.io.reflection;

import org.supercsv.mock.CustomerStringBean;

import java.util.Objects;

/**
 * non-public Bean with String values only - for testing reading/writing without processors.
 * 
 * @author James Bassett
 * @author Pietro Aragona
 * @author Fabian Seifert
 */
class CustomerStringProtectedBean {
	
	private String customerNo;
	private String firstName;
	private String lastName;
	private String birthDate;
	private String birthTime;
	private String mailingAddress;
	private String married;
	private String numberOfKids;
	private String favouriteQuote;
	private String email;
	private String loyaltyPoints;
	
	/**
	 * Default Constructor.
	 */
	protected CustomerStringProtectedBean() {
	}
	
	/**
	 * Constructs a CustomerStringProtectedBean from a CustomerStringBean.
	 */
	protected CustomerStringProtectedBean(CustomerStringBean customerStringBean) {
		this.customerNo = customerStringBean.getCustomerNo();
		this.firstName = customerStringBean.getFirstName();
		this.lastName = customerStringBean.getLastName();
		this.birthDate = customerStringBean.getBirthDate();
		this.birthTime = customerStringBean.getBirthTime();
		this.mailingAddress = customerStringBean.getMailingAddress();
		this.married = customerStringBean.getMarried();
		this.numberOfKids = customerStringBean.getNumberOfKids();
		this.favouriteQuote = customerStringBean.getFavouriteQuote();
		this.email = customerStringBean.getEmail();
		this.loyaltyPoints = customerStringBean.getLoyaltyPoints();
	}
	
	/**
	 * @return the customerNo
	 */
	protected String getCustomerNo() {
		return customerNo;
	}
	
	/**
	 * @param customerNo
	 *            the customerNo to set
	 */
	@SuppressWarnings("unused")
	protected void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}
	
	/**
	 * @return the firstName
	 */
	protected String getFirstName() {
		return firstName;
	}
	
	/**
	 * @param firstName
	 *            the firstName to set
	 */
	@SuppressWarnings("unused")
	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * @return the lastName
	 */
	protected String getLastName() {
		return lastName;
	}
	
	/**
	 * @param lastName
	 *            the lastName to set
	 */
	@SuppressWarnings("unused")
	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * @return the birthDate
	 */
	protected String getBirthDate() {
		return birthDate;
	}
	
	/**
	 * @param birthTime
	 *            the birthTime to set
	 */
	@SuppressWarnings("unused")
	protected void setBirthTime(String birthTime) {
		this.birthTime = birthTime;
	}
	
	/**
	 * @return the birthDate
	 */
	@SuppressWarnings("unused")
	protected String getBirthTime() {
		return birthTime;
	}
	
	/**
	 * @param birthDate
	 *            the birthDate to set
	 */
	@SuppressWarnings("unused")
	protected void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	/**
	 * @return the mailingAddress
	 */
	@SuppressWarnings("unused")
	protected String getMailingAddress() {
		return mailingAddress;
	}
	
	/**
	 * @param mailingAddress
	 *            the mailingAddress to set
	 */
	@SuppressWarnings("unused")
	protected void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}
	
	/**
	 * @return the married
	 */
	@SuppressWarnings("unused")
	protected String getMarried() {
		return married;
	}
	
	/**
	 * @param married
	 *            the married to set
	 */
	@SuppressWarnings("unused")
	protected void setMarried(String married) {
		this.married = married;
	}
	
	/**
	 * @return the numberOfKids
	 */
	@SuppressWarnings("unused")
	protected String getNumberOfKids() {
		return numberOfKids;
	}
	
	/**
	 * @param numberOfKids
	 *            the numberOfKids to set
	 */
	@SuppressWarnings("unused")
	protected void setNumberOfKids(String numberOfKids) {
		this.numberOfKids = numberOfKids;
	}
	
	/**
	 * @return the favouriteQuote
	 */
	@SuppressWarnings("unused")
	protected String getFavouriteQuote() {
		return favouriteQuote;
	}
	
	/**
	 * @param favouriteQuote
	 *            the favouriteQuote to set
	 */
	@SuppressWarnings("unused")
	protected void setFavouriteQuote(String favouriteQuote) {
		this.favouriteQuote = favouriteQuote;
	}
	
	/**
	 * @return the email
	 */
	protected String getEmail() {
		return email;
	}
	
	/**
	 * @param email
	 *            the email to set
	 */
	@SuppressWarnings("unused")
	protected void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return the loyaltyPoints
	 */
	public String getLoyaltyPoints() {
		return loyaltyPoints;
	}
	
	/**
	 * @param loyaltyPoints
	 *            the loyaltyPoints to set
	 */
	public void setLoyaltyPoints(String loyaltyPoints) {
		this.loyaltyPoints = loyaltyPoints;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((birthTime == null) ? 0 : birthTime.hashCode());
		result = prime * result + ((customerNo == null) ? 0 : customerNo.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((favouriteQuote == null) ? 0 : favouriteQuote.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((loyaltyPoints == null) ? 0 : loyaltyPoints.hashCode());
		result = prime * result + ((mailingAddress == null) ? 0 : mailingAddress.hashCode());
		result = prime * result + ((married == null) ? 0 : married.hashCode());
		result = prime * result + ((numberOfKids == null) ? 0 : numberOfKids.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( this == obj ) {
			return true;
		}
		if( obj == null ) {
			return false;
		}
		if( !(obj instanceof CustomerStringProtectedBean) ) {
			return false;
		}
		CustomerStringProtectedBean other = (CustomerStringProtectedBean) obj;
		if( !Objects.equals(birthDate, other.birthDate) ) {
			return false;
		}
		
		if( !Objects.equals(birthTime, other.birthTime) ) {
			return false;
		}
		
		if( !Objects.equals(customerNo, other.customerNo) ) {
			return false;
		}
		
		if( !Objects.equals(email, other.email) ) {
			return false;
		}
		
		if( !Objects.equals(favouriteQuote, other.favouriteQuote) ) {
			return false;
		}
		
		if( !Objects.equals(firstName, other.firstName) ) {
			return false;
		}
		
		if( !Objects.equals(lastName, other.lastName) ) {
			return false;
		}
		
		if( !Objects.equals(loyaltyPoints, other.loyaltyPoints) ) {
			return false;
		}
		
		if( !Objects.equals(mailingAddress, other.mailingAddress) ) {
			return false;
		}
		
		if( !Objects.equals(married, other.married) ) {
			return false;
		}

		return Objects.equals(numberOfKids, other.numberOfKids);
	}
	
}
