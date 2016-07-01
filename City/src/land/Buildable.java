package land;

import java.util.List;

import asset.Structure;

public interface Buildable {
	List<Structure> getStructures();
	boolean addStructure(Structure structure);
}
