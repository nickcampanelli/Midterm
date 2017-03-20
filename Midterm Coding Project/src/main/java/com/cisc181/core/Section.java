package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Section {

	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;

	public Section() {

	}

	public Section(UUID courseID, UUID semesterID, UUID sectionID, int roomID) {
		CourseID = courseID;
		SemesterID = semesterID;
		SectionID = sectionID;
		RoomID = roomID;
	}

	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}

	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

	public UUID getCourseID() {
		return CourseID;
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public int getRoomID() {
		return RoomID;
	}

}