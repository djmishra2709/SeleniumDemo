package com.homepagetestcase;

import java.io.IOException;

import org.testng.annotations.Test;

import readExcelData.ReadTestDataSheet;

public class ReadingExcel {
	@Test
	public void readExcel() throws IOException
	{
		ReadTestDataSheet.readtestSheet();
	}

}
