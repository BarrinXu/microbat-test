package microbat.probability.SPP.pathfinding;

import debuginfo.NodeFeedbacksPair;
import microbat.model.trace.TraceNode;

public interface DijstraNode {
	public double getDistance();
	public void setDistance(final double distance);
//	public double calProb();
	
	public boolean isVisited();
	public void setVisisted(final boolean isVisited);
	
	public NodeFeedbacksPair getPrevAction();
	public void setPrevAction(final NodeFeedbacksPair node);
	
	public void init(boolean isStartNode);
	
	public TraceNode getTraceNode();
}
