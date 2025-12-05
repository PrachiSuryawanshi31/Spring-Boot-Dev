package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.DocumentService;
import com.example.demo.Service.ExcelDocumentServiceImpl;
import com.example.demo.Service.PDFDocumentServiceImpl;



@RestController
@RequestMapping("print")
@Qualifier("ExcelDocumentServiceImpl")
public class DocumentController {

    private ExcelDocumentServiceImpl excelDocumentServiceImpl;
	private PDFDocumentServiceImpl pdfDocumentServiceImpl;
	private DocumentService documentService;
	private ApplicationContext applicationContext;

	
	
    DocumentController(ExcelDocumentServiceImpl excelDocumentServiceImpl) {
        this.excelDocumentServiceImpl = excelDocumentServiceImpl;
    }



	//Setter Injection
    
    @Autowired
	void setPdfDocumentService(PDFDocumentServiceImpl pdfDocumentServiceImpl)
	{
		this.pdfDocumentServiceImpl=pdfDocumentServiceImpl;
	}
	
    @Autowired
	void setExcelDocumentService(ExcelDocumentServiceImpl excelDocumentServiceImpl)
	{
		this.excelDocumentServiceImpl= excelDocumentServiceImpl;
	}
	
    @Autowired
	void setDocumentService(DocumentService documentService)
	{
		this.documentService =documentService;
	}
	
    @Autowired
	void setApplicationContext(ApplicationContext applicationContext)
	{
		this.applicationContext= applicationContext;
	}
	
	
	@GetMapping("/{type}")
	public String printInvoice(@PathVariable String type)
	{
		if(type.equals("pdf"))
		{
			documentService= applicationContext.getBean(PDFDocumentServiceImpl.class);
		}
		
		if(type.equals("excel"))
		{
		 documentService =	applicationContext.getBean(ExcelDocumentServiceImpl.class);
		}
		
		return documentService.collectData();
	}

}
