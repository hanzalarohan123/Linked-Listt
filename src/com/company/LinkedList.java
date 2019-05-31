package com.company;

import java.util.Objects;

public class LinkedList<T> {
    NODES<T> BM;
    NODES<T> EM;
    int size;

    public LinkedList() {
        clear();
    }

    public void clear() {
        this.BM = new NODES<>(null, null, this.EM);
        this.EM = new NODES<>(null, this.BM, null);
        this.EM.next = this.BM;
    }

    public void size() {
        System.out.println("size is " + size);
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;

        } else {
            return false;
        }
    }

    public void showAll()
    {
        if (!isEmpty())
        {
            NODES<T> node = this.BM.next;
            for (int i = 0; i < this.size; i++)
            {
                System.out.println("Node is " + i + "the data is " + node.data);
                node = node.next;
            }


        }
        else
            {
            System.out.println("empty list");
        }

    }

    public void addBefore(NODES<T> node, T data)
    {

        NODES<T> node3 = new NODES<>(data, node.prev, node);
        node3.next = node;
        node3.prev = node.prev;
        node.prev.next=node3;
        node.prev=node3;
        this.size++;
        node3.data=data;
    }

    public void addLocation(int Location, T data)
    {
        addBefore(getNode(Location), data);


    }
    public NODES<T> getNode(int Location)
    {
        NODES<T> node;
        if((Location<0)||(Location>this.size))
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        if(Location<this.size/2) {
            node = this.BM;
            for (int i = 0; i < Location; i++) {
                node = node.next;
            }
        }
        else
        {
            node=this.EM;
            for(int i=this.size;i>Location;i++)
            {
                node=node.prev;
            }
        }
        return node;
    }
    public void Add(int size, Object data)
    {
        Add( getSize(),data);
    }
    public int getSize()
    {
        return size;
    }

    public void showAll2(){
        if(!this.isEmpty()) {
            NODES<T> node = this.BM.next;
            for (int j = 0; j < this.size; j++) {
                System.out.println("Node " + j + " is "
                        + node.data);
                node = node.next;
            }
        }
        else
            System.out.println("List is Currently Empty");
    }

    public Object Get(int location)
    {
        return getNode(location).data;
    }
    public void Set(int location, T newValue)
    {
        NODES<T> temp = getNode (location);
        temp.data = newValue;
    }
    public void Remove(NODES<T> node)
    {
        node.next.prev = node.prev;
        node.prev.next = node.next;
        this.size--;
    }
    public void Remove(int location)
    {
        Remove ( getNode(location) );
    }

    public NODES Search(T data)
    {
        NODES Nodee=BM;
        boolean checking=true;
        int check=size;
        while (checking == true )
        {
            if(Nodee.data==data && check>=0)
            {
                checking=false;
                return Nodee;
            }else {
                Nodee=Nodee.next;
                check--;
            }

            if(check<0)
            {
                checking=false;
            }

        }

        if(check<0)
        {
            Nodee=null;
            System.out.println("Node not found");
        }

        return Nodee;
    }

    public boolean HasData(T data)
    {
        boolean checking=true;
        NODES Nnode=BM;
        int check=size;
        while (checking == true )
        {
            if(Nnode.data==data && check>=0)
            {
                checking=false;
                return true;
            }else {
                Nnode=Nnode.next;
                check--;
            }

            if(check<0)
                checking=false;
        }

        if (check<0)
            checking=false;

        return checking;
    }



    public void add(T data)
    {
        addBefore(this.EM,data);

    }

    public void set(int Location,T data)
    {
        NODES erNode=getNode(Location);

        addBefore(erNode,data);
    }

    public T get(int Location)
    {
        Object data= getNode(Location).data;
        return getNode(Location).data;
    }



}

