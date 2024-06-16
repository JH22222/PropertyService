import { Button } from '@mui/material'

const SearchBtn = ({ onClick }) => {
  return (
    <Button
      onClick={onClick}
      fullWidth
      variant="contained"
      sx={{
        backgroundColor: '#56866fec',
        '&:hover': {
          backgroundColor: '#56866f',
        },
      }}
    >
      검색
    </Button>
  )
}

SearchBtn.displayName = 'SearchBtn'

export default SearchBtn