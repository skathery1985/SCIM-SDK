package de.captaingoldfish.scim.sdk.server.filter;


import lombok.EqualsAndHashCode;
import lombok.Getter;


/**
 * author Pascal Knueppel <br>
 * created at: 16.10.2019 - 16:52 <br>
 * <br>
 * represents two expressions that should be put together as an and operation
 */
@EqualsAndHashCode(callSuper = false)
public final class AndExpressionNode extends FilterNode
{

  /**
   * the left and the right node of this expression
   */
  @Getter
  private final FilterNode leftNode, rightNode;

  public AndExpressionNode(FilterNode leftNode, FilterNode rightNode)
  {
    leftNode.setParent(this);
    this.leftNode = leftNode;
    rightNode.setParent(this);
    this.rightNode = rightNode;
    setSubAttributeName(leftNode.getSubAttributeName());
  }

  @Override
  public String toString()
  {
    String leftNodeLeftBrace = "";
    String leftNodeRightBrace = "";
    if (leftNode instanceof OrExpressionNode)
    {
      leftNodeLeftBrace = "(";
      leftNodeRightBrace = ")";
    }
    String rightNodeLeftBrace = "";
    String rightNodeRightBrace = "";
    if (rightNode instanceof OrExpressionNode)
    {
      rightNodeLeftBrace = "(";
      rightNodeRightBrace = ")";
    }
    return leftNodeLeftBrace + leftNode.toString() + leftNodeRightBrace + " and " + rightNodeLeftBrace
           + rightNode.toString() + rightNodeRightBrace;
  }
}
