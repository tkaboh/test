package com.lab2.com.lab2.maven.eclipse;

import java.time.*;
import java.util.*;

public class Invoice {

	private Date invoiceDate;
	private static int invoiceNumber;
	private List<Element> elements;
	private Customer customer;
	
	public Invoice() {}
	public Invoice(Customer c)
	{
		customer = c;
		
	}
	
	public double getTotalGross()
	{
		double gross = 0.00;
		for (Element el : elements)
			{
			 gross+=el.getPriceGross();
			}
		return gross;
	}
	
	public double getTotalNet()
	{
		double net =0.00;
		for(Element el:elements)
		{
			net+= el.getPriceNet();
		}
		return net;
	}
	public int getInvoiceNumber()
	{
		return ++invoiceNumber;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public List<Element> getElements() {
		return elements;
	}

	public void setElements(List<Element> elements) {
		this.elements = elements;
	}

	public void printInvoice()
	{
		System.out.println("Invoice № "+ invoiceNumber);
		for(Element el : elements) {
			System.out.println("-- "+el.getProductName()+" x"+el.getProductQuantity() + " "+el.getPriceAmount());
			System.out.println("Price netto: "+el.getPriceNet() + "/ Gross = "+el.getPriceGross());
		}
		System.out.println("\n Customer : " + customer.toString());
		System.out.println("Seller: " + customer.getS().toString());
		System.out.println("Total NETTO: "+getTotalNet() + "/GROSS : "+getTotalGross());
	}
	
	
	
}
