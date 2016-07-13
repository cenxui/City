package building.furniture;

public class Sofa extends Furniture {
	private static Size mSize;
	private static Type mType;
	private static Material mMaterial;
	
	public Sofa(Size size, Type type, Material material) {
		mSize = size;
		mType = type;
		mMaterial = material;
		
	}
	
	public Size getSofaSize() {
		return mSize;
	}
	
	public Type getSofaType() {
		return mType;
	}
	
	public Material gMaterial() {
		return mMaterial;
	}
	
	public enum Size {
		SmallSofa,
		MediumSofa,
		LargeSofa
	}
	
	public enum Type {
		Standard,
		LType
	}
	
	public enum Material {
		Leather,
		Fabric
	}
}
