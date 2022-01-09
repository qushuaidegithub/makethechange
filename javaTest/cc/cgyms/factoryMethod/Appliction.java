package book.cgyms.factoryMethod;

public abstract class Appliction {
	public String type;
	public Class<? extends Document> clazz;

	// 工厂方法，用于生产对象
	public abstract Document CreateDocument() throws Exception;

	// 工厂方法的精髓在于
	// NewDocument方法作为提供给客户程序调用的接口
	// CreateDocument抽象方法作为真正生产对象的方法
	// 而具体生产内容由客户程序通过继承Appliction并实现CreateDocument提供
	// 工厂方法只处理Document接口（做为“产品”的抽象类）
	// 具体产品仍然由客户程序通过继承Document来实现
	// 所以方法通常作为框架应用，通过使用抽象类定义和维护对象之间的关系
	// 而具体的对象则由客户程序通过继承提供
	public Document NewDocumentByType(String type) throws Exception {
		this.type = type;
		Document document = CreateDocument();
		document.Open();
		return document;
	}

	public Document NewDocumentAuto(Class<? extends Document> documentClazz)
			throws Exception {
		clazz = documentClazz;
		Document document = CreateDocument();
		document.Open();
		return document;
	}

	public void OpenDocument() {

	}
}
