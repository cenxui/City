package land;

import java.util.List;

import asset.Structure;

interface Buildable {
	List<Structure> getStructures();
	boolean addStructure(Structure structure);
}
