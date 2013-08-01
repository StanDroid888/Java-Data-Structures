/**
 * @author Stanley Wong
 * Class: HashNode.java
 *
 */
public class HashNode {

		Integer data;
		int occurances;
		Status nodeStatus;
		
		public Status getNodeStatus() {
			return nodeStatus;
		}
		public void setNodeStatus(Status nodeStatus) {
			this.nodeStatus = nodeStatus;
		}
		public HashNode(Integer data) {
			this.data = data;
		}
		public Integer getData() {
			return data;
		}
		public void setData(Integer data) {
			this.data = data;
		}
		public int getOccurances() {
			return occurances;
		}
		public void setOccurances(int occurances) {
			this.occurances = occurances;
		}
 			
}
