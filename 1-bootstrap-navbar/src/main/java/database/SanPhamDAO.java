package database;

import java.util.ArrayList;

import model.SanPham;

public class SanPhamDAO implements DAOinterface<SanPham>{
	private ArrayList<SanPham> data=new ArrayList<SanPham>();

	@Override
	public ArrayList<SanPham> selectAll() {
		return this.data;
	
	}

	@Override
	public SanPham selectById(SanPham t) {
		for (SanPham sanPham : data) {
			if(sanPham.equals(t)) {
				return sanPham;
			}
			
		}
		return null;
	}

	@Override
	public int insert(SanPham t) {
		if(this.selectById(t)==null) {
			this.data.add(t);
			return 1;
		}
		return 0;
	}

	@Override
	public int insertAll(ArrayList<SanPham> arr) {
		int count=0;
		for (SanPham sanPham : arr) {
			count+=this.insert(sanPham);
			
		}
		return count;
	}

	@Override
	public int delete(SanPham t) {
		if(this.selectById(t)!=null) {
			this.data.remove(t);
				return 1;
		
			
		}
		return 0;
	}

	@Override
	public int deleteAll(ArrayList<SanPham> arr) {
		int count=0;
		for (SanPham sanPham : arr) {
			count+=this.delete(sanPham);
			
		}
		return count;
	}

	@Override
	public int update(SanPham t) {
		 if(this.selectById(t)!=null) {
			 this.data.remove(t);
			 this.data.add(t);
			 return 1;
		 }
		 return 0;
	}

}
