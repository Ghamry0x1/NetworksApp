# NetworksApp

A group of mobile nodes are moving within an area of 100x100 meters. Each node can send and receive message to and from other nodes within a 20 meters range in each direction. A message transfer will cost a node 1 mw of its battery power. If a node wants to send a message to a specific node, it simply broadcasts it, then its neighbor nodes will receive it, and then forwards it (by resending) it to its own neighbors until the message finds it destination.
