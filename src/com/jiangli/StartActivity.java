package com.jiangli;

import net.sf.andpdf.pdfviewer.PdfViewerActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class StartActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 Intent intent = new Intent(this, DemoPdfActivity.class);
	        intent.putExtra(PdfViewerActivity.EXTRA_PDFFILENAME, "/data/test.pdf");
	        startActivity(intent);
	}
	
	

}
