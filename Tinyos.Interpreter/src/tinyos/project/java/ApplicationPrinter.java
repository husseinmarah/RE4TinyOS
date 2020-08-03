package tinyos.project.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSException;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;

public class ApplicationPrinter extends TinyosParserBaseListener {
	
	BufferedTokenStream tokens;
	
	boolean inEvent;
	String currentEvent;
	ArrayList<String> Events;
	
	boolean inTask;
	String currentTask;
	ArrayList<String> Tasks;
	
	boolean inUsesInterface;
	String currentUsesInterface;
	ArrayList<String> UsesInterfaces;
	
	boolean inProvidesInterface;
	String currentProvidesInterface;
	ArrayList<String> ProvidesInterfaces;
	
	boolean in_nesC;
	String current_nesC;
	ArrayList<String> nesCs;
	
	boolean inHelperFunction;
	String currentHelperFunction;
	ArrayList<String> HelperFunctions;
	
	boolean inWiring;
	String currentWiring;
	ArrayList<String> Wirings;
	
	boolean inDefinesComponents;
	String currentDefinesComponent;
	ArrayList<String> DefinesComponentss;
	
	boolean inIncludeModuel;
	String currentIncludeModuel;
	ArrayList<String> IncludeModuels;
	
	boolean inIncludeConfiguration;
	String currentIncludeConfiguration;
	ArrayList<String> IncludeConfigurations;
	
	boolean inEventContent;
	String curretEventContent;
	ArrayList<String> EventContents;
	
	boolean inTaskContent;
	String curretTaskContent;
	ArrayList<String> TaskContents;
	
	boolean inHelperFunctionContent;
	String currentHelperFunctionContent;
	ArrayList<String> HelperFunctionContents;
	
	String moduleName;
	String configurationName;
	int i;
	int k;
	int j=0;
	int index = 0;
	int eventCounts = 0;
	int taskCounts = 0;
	int ModuleImplementationBodyIndex=0;
	Scanner scanner = new Scanner(System.in);
	
	public ApplicationPrinter(BufferedTokenStream tokens) {
		this.tokens = tokens;
		System.out.println("Application Printer Started");
		
	}
	
	public void enterCompilationUnit(TinyosParser.CompilationUnitContext ctx) {
		
		// Define the Array Lists to Store elements
		ApplicationPrinter.this.Events = new ArrayList<String>();
		ApplicationPrinter.this.UsesInterfaces = new ArrayList<String>();
		ApplicationPrinter.this.ProvidesInterfaces = new ArrayList<String>();
		ApplicationPrinter.this.Tasks = new ArrayList<String>();
		ApplicationPrinter.this.nesCs = new ArrayList<String>();
		ApplicationPrinter.this.HelperFunctions = new ArrayList<String>();
		ApplicationPrinter.this.Wirings = new ArrayList<String>();
		ApplicationPrinter.this.DefinesComponentss = new ArrayList<String>();
		ApplicationPrinter.this.IncludeModuels = new ArrayList<String>();
		ApplicationPrinter.this.IncludeConfigurations = new ArrayList<String>();
		ApplicationPrinter.this.EventContents = new ArrayList<String>();
		ApplicationPrinter.this.TaskContents = new ArrayList<String>();
		ApplicationPrinter.this.HelperFunctionContents = new ArrayList<String>();
	}
	
	public void enterComponentDeclaration(TinyosParser.ComponentDeclarationContext ctx) {
	}
	
	public void exitComponentDeclaration(TinyosParser.ComponentDeclarationContext ctx) {
	}
	
	public void enterModuleDeclaration(TinyosParser.ModuleDeclarationContext ctx) {
	}
	
	public void exitModuleDeclaration(TinyosParser.ModuleDeclarationContext ctx) {
		// get module name from module file
		// moduleName = ctx.moduleSignature().moduleName().getText();
		moduleName = ctx.moduleSignature().moduleName().start.getInputStream()
		.getText(Interval.of(ctx.moduleSignature().moduleName().start.getStartIndex(),
		ctx.moduleSignature().moduleName().stop.getStopIndex()));
		System.out.println("The Module Component Name: "+moduleName);
	}
	
	public void enterConfigurationDeclaration(TinyosParser.ConfigurationDeclarationContext ctx) {
	}
	
	public void exitConfigurationDeclaration(TinyosParser.ConfigurationDeclarationContext ctx) {
		// get configuration name from configuration file
		configurationName = ctx.configurationSignature().configurationName().getText();
		System.out.println("The Configuration Component Name: "+configurationName);
	}
	
	public void exitCompilationUnit(TinyosParser.CompilationUnitContext ctx) {
	FileOutputStream fos = null;
	try {
	
	// Save the file just without "C"
	String programName = moduleName.substring(0, moduleName.indexOf("C"));
	// Document doc = new DocumentImpl();
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	DocumentBuilder builder = factory.newDocumentBuilder();
	Document doc = builder.newDocument();
	doc.setXmlStandalone(true);
	// Get the MetaModel Name from the user
	// System.out.print("Enter MetaModel Name: ");
	// String metaModelName = scanner.nextLine();
	// System.out.print("Enter Port Number: ");
	// String portnumber = scanner.nextLine();
	Element xmi = doc.createElement("tinyos_metamodel:Mote");
	xmi.setAttribute("xmi:version", "2.0");
	xmi.setAttribute("xmlns:xmi", "http://www.omg.org/XMI");
	xmi.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
	xmi.setAttribute("xmlns:tinyos_metamodel", "http://emf.tinyos_metamodel");
	xmi.setAttribute("xsi:schemaLocation", "http://emf.tinyos_metamodel tinyos_metamodel.ecore");
	// xmi.setAttribute("Port", portnumber);
	doc.appendChild(xmi);
	// Overview step 3. Create the XMI Documentation element, specifying// the
	// program that produced the file (the exporter) and its version.
	Element hasApplication = doc.createElement("hasApplication");
	hasApplication.setAttribute("Name", programName);
	Element hasModuleComponent = doc.createElement("hasComponent");
	hasModuleComponent.setAttribute("Name", "Module Component");
	hasApplication.appendChild(hasModuleComponent);
	Element containsModule = doc.createElement("containsModule");
	containsModule.setAttribute("Name", moduleName);
	hasModuleComponent.appendChild(containsModule);
	Element has_module_signature = doc.createElement("has_module_signature");
	has_module_signature.setAttribute("Name", moduleName);
	containsModule.appendChild(has_module_signature);
	
	Element has_module_implementation = doc.createElement("has_module_implementation");
	containsModule.appendChild(has_module_implementation);
	
	Element hasConfigurationComponent = doc.createElement("hasComponent");
	hasConfigurationComponent.setAttribute("Name", "Configuration Component");
	hasApplication.appendChild(hasConfigurationComponent);
	
	Element containsConfiguration = doc.createElement("containsConfiguration");
	containsConfiguration.setAttribute("Name", configurationName);
	hasConfigurationComponent.appendChild(containsConfiguration);
	
	Element has_configuration_signature = doc.createElement("has_configuration_signature");
	has_configuration_signature.setAttribute("Name", configurationName);
	containsConfiguration.appendChild(has_configuration_signature);
	
	Element has_configuration_implementation = doc.createElement("has_configuration_implementation");
	containsConfiguration.appendChild(has_configuration_implementation);
	
	// Create "hasWiring" to the "has_configuration_implementation"
	Element hasWiring = doc.createElement("hasWiring");
	hasWiring.setAttribute("Description", "");
	has_configuration_implementation.appendChild(hasWiring);
	
	Element implementsEvent = doc.createElement("implementsEvent");
	
	Element implementsTask = doc.createElement("implementsTask");
	
	Element implements_helper_function = doc.createElement("implements_helper_function");
	
	
	// Loop to get the "nesC Wiring code" from the array-list, and put them in the
	// xmi
	for (String defines_component : ApplicationPrinter.this.DefinesComponentss) {
	// Create "definesComponents" to the "has_configuration_implementation"
	Element definesComponents = doc.createElement("definesComponents");
	definesComponents.setAttribute("Name", defines_component);
	has_configuration_implementation.appendChild(definesComponents);
	}
	
	// Loop to get the "nesC Wiring code" from the array-list, and put them in the
	// xmi
	for (String wiring : ApplicationPrinter.this.Wirings) {
	System.out.println("Printing Wiring: "+wiring);
	Element has_nesC_wiring_code = doc.createElement("has_nesC_wiring_code");
	has_nesC_wiring_code.setAttribute("Content", wiring);
	hasWiring.appendChild(has_nesC_wiring_code);
	}
	
	// Loop to get the uses interface from the array-list, and put them in the xmi
	for (String uses_interface : ApplicationPrinter.this.UsesInterfaces) {
	System.out.println("Printing Uses Interfaces: "+uses_interface);
	Element usesInterface = doc.createElement("usesInterface");
	usesInterface.setAttribute("Name", uses_interface);
	has_module_signature.appendChild(usesInterface);
	}
	
	// Loop to get the uses interface from the array-list, and put them in the xmi
	for (String provides_interface : ApplicationPrinter.this.ProvidesInterfaces) {
	System.out.println("Printing Provides Interfaces: "+provides_interface);
	Element providesInterface = doc.createElement("providesInterface");
	providesInterface.setAttribute("Name", provides_interface);
	has_module_signature.appendChild(providesInterface);
	}
	
	// Loop to get the "nesC statements" from the array-list, and put them in the
	// xmi
	for (String nesC : ApplicationPrinter.this.nesCs) {
	//System.out.println("Printing nesC Statements: "+nesC);
	Element has_nesC_code = doc.createElement("has_nesC_code");
	has_nesC_code.setAttribute("Content", nesC);
	has_module_implementation.appendChild(has_nesC_code);
	}
	
	// Loop to get the "Events" from the array-list, and put them in the xmi
	for (String event : ApplicationPrinter.this.Events) {			
	// Insert the contents of Event, just "stat" statements
	//The following lines to print the content of the event 
	if (event.startsWith("EVENT_CONTENT"))
	{
	event=event.replace("EVENT_CONTENT", "");
	//Remove the start and end brackets "{}"
	event=event.substring(1, event.length()-1);
	implementsEvent.setAttribute("Contents", event);
	}
	else
	{
	implementsEvent = doc.createElement("implementsEvent");
	implementsEvent.setAttribute("Name", event);
	System.out.println("Printing Events: "+event);
	}
	has_module_implementation.appendChild(implementsEvent);
	}
	
	// Loop to get the "Tasks" from the array-list, and put them in the xmi
	for (String task : ApplicationPrinter.this.Tasks) {			
	// Insert the contents of Task, just "stat" statements
	if (task.startsWith("TASK_CONTENT"))
	{
	task=task.replace("TASK_CONTENT", "");
	task=task.substring(1, task.length()-1);
	implementsTask.setAttribute("Contents", task);
	}
	else{
	implementsTask = doc.createElement("implementsTask");
	implementsTask.setAttribute("Name", task);
	System.out.println("Printing Tasks: "+task);
	}
	has_module_implementation.appendChild(implementsTask);
	}
	
	// Loop to get the "Helper Functions" from the array-list, and put them in the
	// xmi
	for (String helper_function : ApplicationPrinter.this.HelperFunctions) {			
	//implements_helper_function.setAttribute("Name", helper_function);
	//has_module_implementation.appendChild(implements_helper_function);
	
	// Insert the contents of helper_functions
	if (helper_function.startsWith("HELPER_FUNCTION_CONTENT"))
	{
	helper_function=helper_function.replace("HELPER_FUNCTION_CONTENT", "");
	helper_function=helper_function.substring(1, helper_function.length()-1);
	implements_helper_function.setAttribute("Contents", helper_function);
	
	}
	else{
	implements_helper_function = doc.createElement("implements_helper_function");
	implements_helper_function.setAttribute("Name", helper_function);
	System.out.println("Printing Helper Functions: "+helper_function);
	}
	has_module_implementation.appendChild(implements_helper_function);
	
	}
	
	// Loop to get the "Module Include Definition" from the array-list, and put them
	// in the xmi
	for (String include_module : ApplicationPrinter.this.IncludeModuels) {
	System.out.println("Printing Module Include Definition: "+include_module);
	Element hasIncludeDecleration = doc.createElement("hasIncludeDecleration");
	if (include_module.startsWith("\""))
	{	
	//Remove the start and end double quotes
	include_module=include_module.substring(1, include_module.length()-1);			
	}			
	hasIncludeDecleration.setAttribute("Name", include_module);
	hasModuleComponent.appendChild(hasIncludeDecleration);
	}
	
	// Loop to get the "Configuration Include Definition" from the array-list, and
	// put them in the xmi
	for (String include_configuration : ApplicationPrinter.this.IncludeConfigurations) {
	System.out.println("Printing Configuration Include Definition: "+include_configuration);
	Element hasIncludeDecleration = doc.createElement("hasIncludeDecleration");
	if (include_configuration.startsWith("\""))
	{
	//Remove the start and end double quotes
	include_configuration=include_configuration.substring(1, include_configuration.length()-1);			
	}
	hasIncludeDecleration.setAttribute("Name", include_configuration);
	hasConfigurationComponent.appendChild(hasIncludeDecleration);
	}
	
	/*This loop to print the call commands
	for (String CallStat : ApplicationPrinter.this.EventContents) {
	System.out.println("Printing Call Statements in Event (Command)");
	Element callsCommand = doc.createElement("callsCommand");
	callsCommand.setAttribute("Name", CallStat);
	implementsEvent.appendChild(callsCommand);
	}
	*/
	
	// Append all children to the root element
	xmi.appendChild(hasApplication);
	
	//Begin write DOM to file
	//String pathName = ("C:\\antlr_xmi\\Results\\Output\\");
	//String pathName = "";
	//String fileName = programName + ".xmi";
	//File f = new File(pathName + fileName);
	
	
	String workingDirectory = System.getProperty("user.dir");
	//****************//
	String absoluteFilePath = "";
	//absoluteFilePath = workingDirectory + System.getProperty("file.separator") + filename;
	String fileName = programName + ".xmi";
	absoluteFilePath = workingDirectory + File.separator + fileName;
	System.out.println("**************************************"+"\n");
	System.out.println("Final filepath : " + absoluteFilePath);		
	File f = new File(absoluteFilePath);
	
	//File f = new File("C:\\antlr_xmi\\xmi_test");
	fos = new FileOutputStream(f);
	DOMImplementationRegistry reg = DOMImplementationRegistry.newInstance();
	DOMImplementationLS impl = (DOMImplementationLS) reg.getDOMImplementation("LS");
	LSSerializer serializer = impl.createLSSerializer();
	// Set this to true if the output needs to be beautified.
	serializer.getDomConfig().setParameter("format-pretty-print", Boolean.TRUE);
	// serializer.getDomConfig().setParameter("xml-declaration", f);
	LSOutput lso = impl.createLSOutput();
	lso.setEncoding("UTF-8");
	lso.setByteStream(fos);
	serializer.write(doc, lso);
	// return serializer.writeToString(doc);
	} catch (ClassNotFoundException e) {
	e.printStackTrace();
	} catch (InstantiationException e) {
	e.printStackTrace();
	} catch (IllegalAccessException e) {
	e.printStackTrace();
	} catch (ClassCastException e) {
	e.printStackTrace();
	} catch (DOMException e) {
	e.printStackTrace();
	} catch (LSException e) {
	e.printStackTrace();
	} catch (ParserConfigurationException e) {
	e.printStackTrace();
	} catch (FileNotFoundException e) {
	e.printStackTrace();
	} finally {
	if (fos != null) {
	try {
	fos.close();
	} catch (Exception e) {
	e.printStackTrace();
	}
	}
	}
	//System.out.println("index= " +index);
	
	System.out.println("File of "+moduleName.substring(0, moduleName.indexOf("C"))+" Model is created");
	
	/*
	* for (int i=0;
	* i<ctx.componentDeclaration().moduleDeclaration().moduleImplementation().
	* moduleImplementationBody().block().stat().size();i++) {
	* //System.out.println("Print Stat Occurrences");
	* //System.out.println(ctx.componentDeclaration().moduleDeclaration().
	* moduleImplementation().moduleImplementationBody().block().stat(i).getText());
	* }
	*/
	}
	
	public void enterIncludeDeclarationConfiguration(TinyosParser.IncludeDeclarationConfigurationContext ctx) {
	}
	
	public void exitIncludeDeclarationConfiguration(TinyosParser.IncludeDeclarationConfigurationContext ctx) {
	// Print the Module Include Definition
	currentIncludeConfiguration = ctx.qualifiedName().start.getInputStream().getText(
	Interval.of(ctx.qualifiedName().start.getStartIndex(), ctx.qualifiedName().stop.getStopIndex()));
	ApplicationPrinter.this.IncludeConfigurations.add(currentIncludeConfiguration);
	}
	
	public void enterIncludeDeclarationModule(TinyosParser.IncludeDeclarationModuleContext ctx) {
	}
	
	public void exitIncludeDeclarationModule(TinyosParser.IncludeDeclarationModuleContext ctx) {
	// Print the Module Include Definition
	currentIncludeModuel = ctx.qualifiedName().start.getInputStream().getText(
	Interval.of(ctx.qualifiedName().start.getStartIndex(), ctx.qualifiedName().stop.getStopIndex()));
	ApplicationPrinter.this.IncludeModuels.add(currentIncludeModuel);
	}
	
	public void enterEvent_stat(TinyosParser.Event_statContext ctx) {
	// inEvent = true;
	}
	
	public void exitEvent_stat(TinyosParser.Event_statContext ctx) {
	
	// Print the Common Name With Event Condition "()"
	// currentEvent=ctx.common_name(i).getText()+""+ctx.event_condition_block().getText();
	currentEvent = ctx.common_name(i).start.getInputStream()
	.getText(Interval.of(ctx.common_name(i).start.getStartIndex(), ctx.common_name(i).stop.getStopIndex()))
	+ "" + ctx.event_condition_block().start.getInputStream()
	.getText(Interval.of(ctx.event_condition_block().start.getStartIndex(),
	ctx.event_condition_block().stop.getStopIndex()));
	// System.out.println(ctx.common_name(i).getText()+""+ctx.event_condition_block().getText());
	ApplicationPrinter.this.Events.add(currentEvent);
	eventCounts = ctx.getChildCount();
	//System.out.println(ctx.start.getInputStream().getText(
	//Interval.of(ctx.event_condition_block().start.getStartIndex(), ctx.event_condition_block().stop.getStopIndex())));
	
	//Insert event contents in the event code array
	curretEventContent="EVENT_CONTENT"+ctx.event_stat_block(i).start.getInputStream().getText(
	Interval.of(ctx.event_stat_block(i).start.getStartIndex(), ctx.event_stat_block(i).stop.getStopIndex()));
	
	// This option if the previous statement couldn't read some characters
	//curretEventContent="EVENT_CONTENT"+ctx.event_stat_block(i).block().getText();
	ApplicationPrinter.this.Events.add(curretEventContent);
	}
	
	public void enterEvent_stat_block( TinyosParser.Event_stat_blockContext ctx) { }
	
	public void exitEvent_stat_block( TinyosParser.Event_stat_blockContext ctx) {  
	//Insert event contents in the event code array
	//curretEventContent="EVENT_CONTENT"+ctx.getStart().getText();
	//ApplicationPrinter.this.Events.add(curretEventContent); 
	}
	
	public void enterTask_stat(TinyosParser.Task_statContext ctx) {
	}
	
	public void exitTask_stat(TinyosParser.Task_statContext ctx) {
	// Print Tasks
	currentTask = ctx.common_name(i).getText() + "" + ctx.task_condition_block().getText();
	//System.out.println(ctx.common_name(i).getText() + "" + ctx.task_condition_block().getText());
	ApplicationPrinter.this.Tasks.add(currentTask);
	//taskCounts = ctx.getChildCount();
	//curretTaskContent="TASK_CONTENT"+ctx.task_stat_block(i).block().getText();
	//The next line to print the contents of task with spaces
	/*
	curretTaskContent="TASK_CONTENT"+ctx.start.getInputStream().getText(
	Interval.of(ctx.task_stat_block(i).start.getStartIndex(), ctx.task_stat_block(i).stop.getStopIndex()));
	ApplicationPrinter.this.Tasks.add(curretTaskContent);
	*/
	if(ctx.getText().endsWith(";"))
	{
	//System.out.println("The task ends with ;");
	}
	else{
	curretTaskContent="TASK_CONTENT"+ctx.start.getInputStream().getText(
	Interval.of(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
	ApplicationPrinter.this.Tasks.add(curretTaskContent);
	}
	}
	public void enterTask_stat_block( TinyosParser.Task_stat_blockContext ctx) { }
	
	public void exitTask_stat_block( TinyosParser.Task_stat_blockContext ctx) { 
	
	}
	
	
	public void enterUsesState(TinyosParser.UsesStateContext ctx) {
	}
	
	public void exitUsesState(TinyosParser.UsesStateContext ctx) {
	}
	
	public void enterUsesInterfaceDescription(TinyosParser.UsesInterfaceDescriptionContext ctx) {
	}
	
	public void exitUsesInterfaceDescription(TinyosParser.UsesInterfaceDescriptionContext ctx) {
	// Print "Uses Interface"
	// currentUsesInterface=ctx.interfaceDescription(i).getText();
	currentUsesInterface = ctx.start.getInputStream()
	.getText(Interval.of(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
	//System.out.println(ctx.getText());
	ApplicationPrinter.this.UsesInterfaces.add(currentUsesInterface);
	//we use this index if we want to now how many objects this method will return
	index++;
	}
	
	public void enterProvidesInterfaceDescription(TinyosParser.ProvidesInterfaceDescriptionContext ctx) {
	}
	
	public void exitProvidesInterfaceDescription(TinyosParser.ProvidesInterfaceDescriptionContext ctx) {
	// Print "Provides Interface"
	currentProvidesInterface = ctx.start.getInputStream()
	.getText(Interval.of(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
	System.out.println(ctx.getText());
	ApplicationPrinter.this.ProvidesInterfaces.add(currentProvidesInterface);
	}
	
	public void enterBlock( TinyosParser.BlockContext ctx) { }
	
	public void exitBlock( TinyosParser.BlockContext ctx) {  
	
	}
	
	public void enterModuleImplementationBody( TinyosParser.ModuleImplementationBodyContext ctx) { }
	
	public void exitModuleImplementationBody( TinyosParser.ModuleImplementationBodyContext ctx) {
	// Print "The Rule index"
	ModuleImplementationBodyIndex=ctx.getRuleIndex();
	//System.out.printf("The Rule index of \"Module Implementation Body\" is = "+ ModuleImplementationBodyIndex+"\n");
	
	}
	
	public void enterStatement(TinyosParser.StatementContext ctx) {
	}
	
	public void exitStatement(TinyosParser.StatementContext ctx) {
	// Print "nesc code statements"
	// current_nesC=ctx.getText();
	// This method will take the "statements" that just from the "Module Implementation"
	//using this method if the parser will read other statements that we don't need in the model
	//The if statement to determine the depth rule context that we are going to get elements from
	if (ctx.parent.parent.parent.getRuleIndex()==17)
	{
	current_nesC = ctx.start.getInputStream()
	.getText(Interval.of(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
	System.out.println("Printing nesC: "+ctx.getText());
	ApplicationPrinter.this.nesCs.add(current_nesC);
	}
	}
	
	public void enterEnum_stat( TinyosParser.Enum_statContext ctx) { }
	
	public void exitEnum_stat( TinyosParser.Enum_statContext ctx) {
	//This to include the enum declaration inside the module implementation
	current_nesC = ctx.start.getInputStream()
	.getText(Interval.of(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
	System.out.println("Printing nesC enum Statements: "+ctx.getText());
	ApplicationPrinter.this.nesCs.add(current_nesC);
	
	}
	
	public void enterOther_stat(TinyosParser.Other_statContext ctx) {
	}
	
	public void exitOther_stat(TinyosParser.Other_statContext ctx) {
	
	// Print "Helper Functions"
	// currentHelperFunction=ctx.common_name(i).getText()+""+ctx.other_condition_block().getText();
	currentHelperFunction = ctx.common_name(i).start.getInputStream()
	.getText(Interval.of(ctx.common_name(i).start.getStartIndex(), ctx.common_name(i).stop.getStopIndex()))
	+ "" + ctx.other_condition_block().start.getInputStream()
	.getText(Interval.of(ctx.other_condition_block().start.getStartIndex(),
	ctx.other_condition_block().stop.getStopIndex()));
	//System.out.println(ctx.getText());
	ApplicationPrinter.this.HelperFunctions.add(currentHelperFunction);
	
	//The next lines will put the contents of the "helper_function" in the array of strings
	currentHelperFunctionContent="HELPER_FUNCTION_CONTENT"+ctx.other_stat_block(i).start.getInputStream().getText(
	Interval.of(ctx.other_stat_block(i).start.getStartIndex(), ctx.other_stat_block(i).stop.getStopIndex()));
	//currentHelperFunctionContent="HELPER_FUNCTION_CONTENT"+ctx.other_stat_block(i).block().getText();
	ApplicationPrinter.this.HelperFunctions.add(currentHelperFunctionContent);
	
	}
	
	public void enterWiring(TinyosParser.WiringContext ctx) { }
	
	public void exitWiring(TinyosParser.WiringContext ctx) {
	
	// Print "nesC wiring code"
	// currentWiring=ctx.wiring().getText();
	currentWiring = ctx.start.getInputStream()
	.getText(Interval.of(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
	ApplicationPrinter.this.Wirings.add(currentWiring);
	}
	
	
	public void enterComponentsDefinitionDetails( TinyosParser.ComponentsDefinitionDetailsContext ctx) { }
	
	public void exitComponentsDefinitionDetails( TinyosParser.ComponentsDefinitionDetailsContext ctx) {
	// If you want to put "single_line" defined components in one element
	// Print "Define Components"
	// Put all "Definecomponents" elements in the Array
	// Also we used the next code line and we didn't use "getText()"
	// because we want to do prettyPrint, we want to print "spaces" between elements	
	currentDefinesComponent = ctx.start.getInputStream()
	.getText(Interval.of(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
	System.out.println("Printing Define Components: "+ctx.getText());
	ApplicationPrinter.this.DefinesComponentss.add(currentDefinesComponent);	
	}
	
	public void enterComponentsDefinitionName(TinyosParser.ComponentsDefinitionNameContext ctx) {}
	
	public void exitComponentsDefinitionName(TinyosParser.ComponentsDefinitionNameContext ctx) {
	
	}
	
	public void enterDefine_stat( TinyosParser.Define_statContext ctx) { }
	
	public void exitDefine_stat( TinyosParser.Define_statContext ctx) {
	//Insert define statements in the nesc code arrays	
	current_nesC = ctx.start.getInputStream()
	.getText(Interval.of(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
	ApplicationPrinter.this.nesCs.add(current_nesC);
	}
	
	}							